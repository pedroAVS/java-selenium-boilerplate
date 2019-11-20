package io.mb.oneweb.java.selenium.framework._infra;

import com.galenframework.reports.GalenTestInfo;
import com.galenframework.reports.HtmlReportBuilder;
import com.galenframework.reports.model.LayoutReport;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.fail;

@Component
public class LayoutRule extends ZaleniumRule {
    private static final Logger LOG = LoggerFactory.getLogger(LayoutRule.class);

    @Value("${galen.report.path}")
    private String reportFolderPath;

    private GalenTestInfo galenTestInfo;

    private LayoutReport layoutReport;

    private List<GalenTestInfo> galenTestInfoList = new LinkedList<>();

    private HtmlReportBuilder htmlReportBuilder = new HtmlReportBuilder();

    @Override
    protected void finished(Description description) {
        try {
            galenTestInfo = GalenTestInfo.fromString(description.getTestClass().getSimpleName());
            galenTestInfo.getReport().layout(layoutReport, description.getMethodName());

            galenTestInfoList.add(galenTestInfo);

            buildHTMLReport();
        } finally {
            if (galenTestInfo.isFailed()) {
                fail("Layout test failed");
            }
        }
    }

    private void buildHTMLReport() {
        try {
            htmlReportBuilder.build(galenTestInfoList, reportFolderPath);
        } catch (IOException e) {
            LOG.error("Layout Galen Report build failed");
        }
    }

    public void setLayoutReport(LayoutReport layoutReport) {
        this.layoutReport = layoutReport;
    }
}

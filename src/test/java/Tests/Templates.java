package Tests;

import io.qameta.allure.restassured.AllureRestAssured;

public class Templates {
    private static final AllureRestAssured FILTER = new AllureRestAssured();

    private static class InitLogFilter {
        private static final Templates logFilter = new Templates();
    }

    private Templates() {}

    public static Templates filters() {
        return InitLogFilter.logFilter;
    }

    public AllureRestAssured customTemplates() {
        FILTER.setRequestTemplate("tpl/request.ftl");
        FILTER.setResponseTemplate("tpl/response.ftl");
        return FILTER;
    }
}

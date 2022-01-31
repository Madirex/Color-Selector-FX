module com.madirex.madicolorselector {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.madirex.madicolorselector to javafx.fxml;
    exports com.madirex.madicolorselector;
    exports com.madirex.madicolorselector.view;
    opens com.madirex.madicolorselector.view to javafx.fxml;
    exports com.madirex.madicolorselector.controller;
    opens com.madirex.madicolorselector.controller to javafx.fxml;
}
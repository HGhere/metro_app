import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MetroFX extends Application {

    @Override
    public void start(Stage stage) {

        Graph graph = MetroMap.createMetroMap();

        Label title = new Label("Delhi Metro Route Finder");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        ComboBox<String> sourceBox = new ComboBox<>();
        ComboBox<String> destinationBox = new ComboBox<>();

        sourceBox.getItems().addAll(graph.adjList.keySet());
        destinationBox.getItems().addAll(graph.adjList.keySet());

        sourceBox.setPromptText("Select Source Station");
        destinationBox.setPromptText("Select Destination Station");

        Button findButton = new Button("Find Route");

        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setWrapText(true);

        findButton.setOnAction(e -> {

            String source = sourceBox.getValue();
            String destination = destinationBox.getValue();

            if (source == null || destination == null) {
                outputArea.setText("Please select both source and destination.");
                return;
            }

            String result = Dijkstra.findShortestPath(graph, source, destination);
            outputArea.setText(result);
        });

        VBox layout = new VBox(12);
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(
                title,
                sourceBox,
                destinationBox,
                findButton,
                outputArea
        );

        Scene scene = new Scene(layout, 430, 380);
        stage.setTitle("Delhi Metro Route Finder");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

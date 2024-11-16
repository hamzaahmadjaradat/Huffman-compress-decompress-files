module com.example.huffman_project3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.huffman_project3 to javafx.fxml;
    exports com.example.huffman_project3;
}
package lms.windows;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import lms.entities.Book;

public class DisplayFilteredBooksController implements Initializable{
	@FXML
	private AnchorPane rootPane;
	@FXML
	private TableView<Book> booksTable;
	@FXML
	private TableColumn<Book, Integer> id;
	@FXML
	private TableColumn<Book, String> title;
	@FXML
	private TableColumn<Book, String> subject;
	@FXML
	private TableColumn<Book, String> author;
	@FXML
	private TableColumn<Book, String> ISBN;
	@FXML
	private TableColumn<Book, String> publishDate;
	@FXML
	private TableColumn<Book, Integer> quantity;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initCol();		
	}
	
	private void initCol() {
		id.setCellValueFactory(new PropertyValueFactory<>("id"));
		title.setCellValueFactory(new PropertyValueFactory<>("title"));
		subject.setCellValueFactory(new PropertyValueFactory<>("subject"));
		author.setCellValueFactory(new PropertyValueFactory<>("author"));
		ISBN.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
		publishDate.setCellValueFactory(new PropertyValueFactory<>("publishDate"));
		quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
	}
	
	public void fill(ObservableList<Book> list) {
		booksTable.getItems().setAll(list);
	}
}

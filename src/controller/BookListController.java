package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Book;

public class BookListController implements Initializable {
	@FXML
	private TableView<Book> tableBook;

	@FXML
	private TableColumn<Book, String> titleColumn;
	@FXML
	private TableColumn<Book, String> authorColumn;
	@FXML
	private TableColumn<Book, String> isbnColumn;

	@FXML
	private Label titleLabel;
	@FXML
	private Label authorLabel;
	@FXML
	private Label isbnLabel;
	@FXML
	private Label pDateLabel;
	@FXML
	private Label numLabel;
	@FXML
	private Label lstbookcopyv;
	@FXML
	private Label lstbookcopyn;

	@FXML
	private Button btnLogout;

	@FXML
	Button btnMemberManagement;
	
	

	private ObservableList<Book> bookData = DummyData.books;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		titleColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));
		authorColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("authorlst"));
		//isbnColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("iSBN"));
		//isbnColumn.setCellValueFactory(new PropertyValueFactory<Book, String>("iSBN"));

		tableBook.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> showBookDetails(newValue));
		tableBook.setItems(bookData);

	}

	private void showBookDetails(Book book) {
		if (book != null) {
			this.titleLabel.setText(book.getTitle());
			this.authorLabel.setText(book.getAuthorlst());
			this.isbnLabel.setText(book.getiSBN());
			this.numLabel.setText(DummyData.getBookCopyNum(book) + "");
			this.lstbookcopyv.setText(DummyData.getBookCopyAvailable(book));
			this.lstbookcopyn.setText(DummyData.getBookCopyNotAvailable(book));
		} else {
			this.titleLabel.setText("");
			this.authorLabel.setText("");
			this.isbnLabel.setText("");
			this.pDateLabel.setText("");
			this.numLabel.setText("");
			this.lstbookcopyv.setText("");
			this.lstbookcopyn.setText("");
		}
	}

	@FXML
	public void handleDeleteBook() {
		int selectedIndex = tableBook.getSelectionModel().getSelectedIndex();
		if (selectedIndex >= 0) {
			// tableBook.getItems().remove(selectedIndex);
			DummyData.deleteBook(tableBook.getItems().get(selectedIndex));
		} else {
		}
	}

	@FXML
	public void handleEditBook() throws IOException {
		Book selectedBook = tableBook.getSelectionModel().getSelectedItem();
		if (selectedBook != null) {
			boolean okClicked = this.showBookEditDialog(selectedBook);
			if (okClicked) {
				showBookDetails(selectedBook);
			}

		} else {
		}

	}

	@FXML
	public void handleAddBook() throws IOException {
		
		  Book tempBook = new Book("","",); 
		  boolean okClicked = this.showBookEditDialog(tempBook); 
		  if (okClicked) {
		  DummyData.addBook(tempBook.getTitle(), tempBook.getAuthors(),
		  tempBook.getiSBN(), ); }
		 
	}

	@FXML
	public void handleAddBookCopy() {
		Book selectedBook = tableBook.getSelectionModel().getSelectedItem();
		if (selectedBook != null) {
			
			  DummyData.addBookCopy(selectedBook);
			  this.numLabel.setText(DummyData.getBookCopyNum(selectedBook) + "");
			  this.lstbookcopyv.setText(DummyData.getBookCopyAvailable(selectedBook));
			 
		}
	}

	public boolean showBookEditDialog(Book book) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../view/BookEditDialog.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		// Create the dialog Stage.
		Stage dialogStage = new Stage();
		dialogStage.setTitle("Edit Book");
		dialogStage.initModality(Modality.WINDOW_MODAL);
		// dialogStage.initOwner(primaryStage);
		Scene scene = new Scene(page);
		dialogStage.setScene(scene);

		BookEditDialogController controller = loader.getController();
		controller.setDialogStage(dialogStage);
		controller.setBook(book);
		dialogStage.showAndWait();

		return controller.isOkClicked();
	}

	public void memberManageButtonEvent(ActionEvent event) {

		if (event.getSource() == btnMemberManagement) {
			try {
				Stage appStage = (Stage) btnMemberManagement.getScene().getWindow();
				Parent root = FXMLLoader.load(getClass().getResource("/view/MemberManagement.fxml"));
				Scene scene = new Scene(root);
				appStage.setTitle("Member Management");
				appStage.setScene(scene);
				appStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void logoutAction(ActionEvent event) {
		if (event.getSource() == btnLogout) {

			try {
				Stage appStage = (Stage) btnLogout.getScene().getWindow();
				Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("../view/Login.css").toExternalForm());
				appStage.setTitle("Login");
				appStage.setScene(scene);
				appStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

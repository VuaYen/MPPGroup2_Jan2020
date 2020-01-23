package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Role;
import model.User;

public final class DummyData {
	static ObservableList<User> users = FXCollections.observableArrayList();
	static {
		users.add(new User("John","Mathew","012345667","john@gmail.com","admin","123",Role.ADMIN));
		users.add(new User("May","Mathew","012345667","may@gmail.com","librarian","123",Role.LIBRARIAN));
		users.add(new User("Luiz","Mathew","012345667","may@gmail.com","ladin","123",Role.BOTH));
		
	}
}
 
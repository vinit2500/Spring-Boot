package com.solid.principle.Lesson1_SRP.Example4.BetterCode;

/*
   create and delete both here beacuse creation and deletion of user is kind of life cycle
   thing and both create and delete needs database for performing operation and both affecting
   the same table of common database.

   But activity logging may or may not be in the same table or even same database
*/

public class UserManager {

    // UserReposiory userRepository;

    public void createUser(String username) {
        // Code to create a user
        //this.userRepository.create(...)
    }

    public void deleteUser(String username) {
        // Code to delete a user
        // this.userRepository.delete(...)
    }
}

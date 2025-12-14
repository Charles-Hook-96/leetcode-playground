package org.example.datastructures;

import java.util.Stack;

/*
      //Stack = LIFO Data Structure, last-in, first-out
      //Stores objects in a vertical tower
      //push() to add to the top
      //pop() to remove from the bottom
* push
* pop
* peek
* search
* empty
* Uses of stack?
* 1. Undo/redo features in text editors
* 2. Moving back/forward through browser history
* 3. backtracking algorithms (maze, file directories)
* 4. Calling functions (call stack)
* */
public class StackExample {

    public static void example() {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //In order to take the top-most object from a stack, it must be popped and assigned to something
        String myFavGame = stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(myFavGame);
    }

}
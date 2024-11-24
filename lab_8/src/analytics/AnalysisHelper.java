/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

/**
 *
 * @author ayushighia
 */

import data.DataStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import model.Comment;
import model.Post;
import model.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("Average number of likes per comments: " + likeNumber / commentNumber);
            
    }
    public void getMaxLikeCommentPost(){
        DataStore data = DataStore.getInstance();
        Comment commentWithMaxLikes = null;
        
        for(Comment c : data.getComments().values()){
            if(commentWithMaxLikes == null){
                commentWithMaxLikes =c;
            }
            if(c.getLikes() > commentWithMaxLikes.getLikes()){
                commentWithMaxLikes = c;
            }
        }
        int postId = commentWithMaxLikes.getPostId();
        
        System.out.println("Q2- post with most likes per comment"+ data.getPosts().get(postId).toString());
    }
    
 
    public void getPostWithMostComments() {
    DataStore data = DataStore.getInstance();
    Post postWithMostComments = null;

    // Iterate through all posts and find the one with the maximum comments
    for (Post p : data.getPosts().values()) {
        if (postWithMostComments == null) {
            postWithMostComments = p; // Initialize the first post
        }
        if (p.getComments().size() > postWithMostComments.getComments().size()) {
            postWithMostComments = p; // Update if the current post has more comments
        }
    }

    // Print the post with the most comments
    System.out.println("Q3 - Post with the most comments: " + postWithMostComments.getPostId());
}
    
    public void getPassiveUsers(){
        DataStore data = DataStore.getInstance();
        
        HashMap<Integer, Integer> postNumbers = new HashMap<Integer, Integer>();
        for(Post p: data.getPosts().values()){
            int userId = p.getUserId();
            if(postNumbers.containsKey(userId)){
                postNumbers.put(userId, postNumbers.get(userId)+1);
                postNumbers.put(userId,1);
                
            }
            else{
                postNumbers.put(userId,1);
            }
        }
        ArrayList<User> users = new ArrayList(data.getUsers().values());
        Collections.sort(users, new UserMapComparator(postNumbers));
        
        System.out.println("Q4 - The following users have the least posts:");
        
        for(int i=0;i<5;i++){
            System.out.println(users.get(i)+ ", - Post count:"+ postNumbers.get(users.get(i).getId()));
            
        }
    }
    
    public void getPassiveCommentUsers() {
    DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> commentNumbers = new HashMap<Integer, Integer>();

    // Count the number of comments for each user
    for (Comment c : data.getComments().values()) {
        int userId = c.getUserId();
        if (commentNumbers.containsKey(userId)) {
            commentNumbers.put(userId, commentNumbers.get(userId) + 1);
        } else {
            commentNumbers.put(userId, 1);
        }
    }

    // Convert users to a list and sort by the number of comments
    ArrayList<User> users = new ArrayList<>(data.getUsers().values());
    Collections.sort(users, new UserMapComparator(commentNumbers));

    // Display the users with the least comments
    System.out.println("Q5 - The following users have the least comments:");
    for (int i = 0; i < 5 && i < users.size(); i++) {
        System.out.println(users.get(i) + ", - Comment count: " + commentNumbers.get(users.get(i).getId()));
    }
}
    
    public void getPassiveAndActiveOverallUsers() {
    DataStore data = DataStore.getInstance();
    HashMap<Integer, Integer> overallNumbers = new HashMap<>();

    // Count user activity based on comments and likes
    for (Comment c : data.getComments().values()) {
        int userId = c.getUserId();
        if (overallNumbers.containsKey(userId)) {
            overallNumbers.put(userId, overallNumbers.get(userId) + 1 + c.getLikes());
        } else {
            overallNumbers.put(userId, 1 + c.getLikes());
        }
    }

    // Count user activity based on posts
    for (Post p : data.getPosts().values()) {
        int userId = p.getUserId();
        if (overallNumbers.containsKey(userId)) {
            overallNumbers.put(userId, overallNumbers.get(userId) + 1);
        } else {
            overallNumbers.put(userId, 1);
        }
    }

    // Sort users based on overall activity
    ArrayList<User> users = new ArrayList<>(data.getUsers().values());
    Collections.sort(users, new UserMapComparator(overallNumbers));

    // Display the most active and least active users
    System.out.println("Q6 - The following are the least active users:");
    for (int i = 0; i < 5 && i < users.size(); i++) {
        System.out.println(users.get(i) + ", Overall activity score: " + overallNumbers.get(users.get(i).getId()));
    }

    System.out.println("Q7 - The following are the most active users:");
    for (int i = users.size() - 1; i >= users.size() - 6; i--) {
        System.out.println(users.get(i) + ", Overall activity score: " + overallNumbers.get(users.get(i).getId()));
    }
}


    
}

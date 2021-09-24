package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

class AdvancedStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount > 0) {
            postsPerUser = postsCount / (double) usersCount;
            commentsPerUser = commentsCount / (double) usersCount;
        }

        if (postsCount > 0) {
            commentsPerPost = commentsCount / (double) postsCount;
        }
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}

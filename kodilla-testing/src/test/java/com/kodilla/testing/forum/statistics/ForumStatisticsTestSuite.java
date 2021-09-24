package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    private static int testCounter;

    private List<String> generateListOfNUsers(int usersCount) {
        List<String> usersList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            String user = new String("User # " + n);
            usersList.add(user);
        }
        return usersList;
    }

    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Starting tests");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Processing test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("End of tests");
    }

    @Test
    void testOPostsStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(300);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, advancedStatistics.getUsersCount());
        assertEquals(0, advancedStatistics.getPostsCount());
        assertEquals(300, advancedStatistics.getCommentsCount());
        assertEquals(0.0, advancedStatistics.getPostsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerUser());
        assertEquals(0.0, advancedStatistics.getCommentsPerPost());
    }

    @Test
    void test100OPostsStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(300);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, advancedStatistics.getUsersCount());
        assertEquals(1000, advancedStatistics.getPostsCount());
        assertEquals(300, advancedStatistics.getCommentsCount());
        assertEquals(10.0, advancedStatistics.getPostsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerUser());
        assertEquals(0.3, advancedStatistics.getCommentsPerPost());
    }

    @Test
    void testOCommentsStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, advancedStatistics.getUsersCount());
        assertEquals(100, advancedStatistics.getPostsCount());
        assertEquals(0, advancedStatistics.getCommentsCount());
        assertEquals(1.0, advancedStatistics.getPostsPerUser());
        assertEquals(0.0, advancedStatistics.getCommentsPerUser());
        assertEquals(0.0, advancedStatistics.getCommentsPerPost());
    }

    @Test
    void testLessCommentsThanPostsStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, advancedStatistics.getUsersCount());
        assertEquals(200, advancedStatistics.getPostsCount());
        assertEquals(100, advancedStatistics.getCommentsCount());
        assertEquals(2.0, advancedStatistics.getPostsPerUser());
        assertEquals(1.0, advancedStatistics.getCommentsPerUser());
        assertEquals(0.5, advancedStatistics.getCommentsPerPost());
    }

    @Test
    void testMoreCommentsThanPostsStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(300);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, advancedStatistics.getUsersCount());
        assertEquals(100, advancedStatistics.getPostsCount());
        assertEquals(300, advancedStatistics.getCommentsCount());
        assertEquals(1.0, advancedStatistics.getPostsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerPost());
    }

    @Test
    void testOUsersStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(300);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, advancedStatistics.getUsersCount());
        assertEquals(100, advancedStatistics.getPostsCount());
        assertEquals(300, advancedStatistics.getCommentsCount());
        assertEquals(0.0, advancedStatistics.getPostsPerUser());
        assertEquals(0.0, advancedStatistics.getCommentsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerPost());
    }

    @Test
    void test100UsersStatisticsWithMock() {
        //Given
        AdvancedStatistics advancedStatistics = new AdvancedStatistics();
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(300);

        //When
        advancedStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, advancedStatistics.getUsersCount());
        assertEquals(100, advancedStatistics.getPostsCount());
        assertEquals(300, advancedStatistics.getCommentsCount());
        assertEquals(1.0, advancedStatistics.getPostsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerUser());
        assertEquals(3.0, advancedStatistics.getCommentsPerPost());
    }
}

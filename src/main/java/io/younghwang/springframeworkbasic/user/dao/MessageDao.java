package io.younghwang.springframeworkbasic.user.dao;

public class MessageDao {
    ConnectionMaker connectionMaker;

    public MessageDao(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }
}

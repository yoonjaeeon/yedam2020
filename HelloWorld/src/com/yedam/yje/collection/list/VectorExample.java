package com.yedam.yje.collection.list;

import java.util.List;
import java.util.Vector;

class Board {
   String title;
   String content;
   String writer;

   public Board(String title, String content, String writer) {
      super();
      this.title = title;
      this.content = content;
      this.writer = writer;
   }
}

public class VectorExample {
   public static void main(String[] args) {
      List<Board> boardList = new Vector<>();
      boardList.add(new Board("title1", "content1", "writer1"));
      boardList.add(new Board("title2", "content2", "writer2"));
      boardList.add(new Board("title3", "content3", "writer3"));
      for(Board brd : boardList) {
         System.out.println(brd.title + ", " + brd.content);
      }
   }
}
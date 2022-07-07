package com.mansooonuna.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 프로그램 시작 ==");

    int articleNo = 1;
    String id = "dasom";

    while (true) {
      System.out.print("\n명령) ");
      String input = sc.nextLine();
      System.out.println("입력된 명령어 : " + input);


      // 명령어 : exit
      if (input.equals("exit")) {
        break;

        // 명령어 : write
      } else if (input.equals("/user/article/write")) {
        System.out.println("\n※ 게시물 등록 ※");
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("내용 : ");
        String body = sc.nextLine();

        Article article = new Article(articleNo, id, title, body);
        System.out.println(article);

        System.out.println(articleNo + "번 게시물이 등록되었습니다.");
        articleNo++;


      }


    }

    System.out.println("== 프로그램 종료 ==");

    sc.close();

  }
}


class Article {

  int articleNo;
  String userId;
  String title;
  String body;

  Article(int articleNo, String userId, String title, String body) {
    this.articleNo = articleNo;
    this.userId = userId;
    this.title = title;
    this.body = body;
  }

  @Override
  public String toString() {
    return String.format("{ 글번호 : %d, 제  목 : \"%s\", 내  용 : \"%s\" }", articleNo, title, body);

  }


}

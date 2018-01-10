package com.javaex.problem08;

public class Book {
	int bookNO; // 번호
	String title; // 제목
	String author;// 작가
	int stateCode; // 대여유무

	public Book(int bookNO, String title, String author) { // 생성자
		this.bookNO = bookNO;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public int getBookNO() {
		return bookNO;
	}

	public void setBookNO(int bookNO) {
		this.bookNO = bookNO;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent(int number) {
		if (stateCode == 1) {
			this.stateCode = 0;
			System.out.println(getTitle() + "이(가) 대여 됐습니다.");
		}
	}

	public String print() {
		if (stateCode == 1) {
			return "재고있음";
		} else {
			return "대여중";
		}
	}
}

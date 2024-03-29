package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MakeProductSerivceV2 {

	protected List<String> proNameList;
	protected List<String> productList;
	
	public MakeProductSerivceV2() {
		proNameList = new ArrayList<String>();
		productList = new ArrayList<String>();
	}
	
	/*
	 * 과자이름.txt 파일이름을 proFileName 변수로 받고
	 * proFileName 파일을 읽어서 과자이름 List를 추출하기
	 * 임의의 숫자를 발생시켜서 과자가격을 부착하여
	 * 과자정보를 생성
	 * 다른 곳에서 사용 할 수 있도록 return 수행
	 */
	public List<String> getProductList(String proFileName) throws Exception {
		FileReader fileReader = new FileReader(proFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			if(reader.length() < 1) continue;
			
			proNameList.add(reader);
			
		}
		
		buffer.close();
		fileReader.close();
		/*
		 * 파일을 읽기 위해서 FileReader, BufferedReader로 open을 한 후
		 * while() 반복문 내에서 한 줄씩 읽어서 여러가지 연산을 수행하는 과정에서 
		 * 연산 수행시간이 오래걸리거나 어떤 Exception이 발생할 확률이 조금이라도 있다면
		 * 읽어들인 문자열(Reader변수에 담긴 값)을 List<Sring> type의 list로 생성을 하고
		 * 파일을 close() 한 후에
		 * 생성된 list를 사용하여 다른 연산을 수행하자
		 */
		
		for(String pro : proNameList) {
			
			// Math : 수학연산과 관련된 여러 method()를 가지고 있는 java Class이다.
			// 클래스를 객체로 생성하지 않고도 간단히 난수를 발생 할 수 있다.
			
			int price = (int)(Math.random() * (5000-800+1)+800);

			// 상품가격에서 원단위 절사하기
			//price/=10;
			//price*=10;
			
			// 원단위 반올림하고 10원 단위까지 사용
			
			price = (int)((price+5)/10)*10;
				
			
			String product = String.format("%s:%d", pro,price);
			productList.add(product);
		}
		
		return productList;
	}
	
	
}

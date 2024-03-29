package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.service.MakeProductSerivceV2;
import com.biz.iolist.service.WriteProductSerivce;

public class iolistEx_02 {

	public static void main(String[] args) {

		String proFileName = "src/com/biz/iolist/과자이름.txt";
		String proWriteFile = "src/com/biz/iolist/과자가격.txt";
		
		MakeProductSerivceV2 ms = new MakeProductSerivceV2();
		WriteProductSerivce ws = new WriteProductSerivce();
		
		try {
			List<String> productList = ms.getProductList(proFileName);
			ws.setProList(productList);
			ws.productWrite(proWriteFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

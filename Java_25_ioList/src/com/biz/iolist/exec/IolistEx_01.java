package com.biz.iolist.exec;

import com.biz.iolist.service.MakeProductSerivceV1;

public class IolistEx_01 {

	public static void main(String[] args) {

		MakeProductSerivceV1 ms = new MakeProductSerivceV1();

		String proFileName = "src/com/biz/iolist/과자이름.txt";
		String proWriteFile = "src/com/biz/iolist/과자가격.txt";

		try {
			ms.getProductList(proFileName, proWriteFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

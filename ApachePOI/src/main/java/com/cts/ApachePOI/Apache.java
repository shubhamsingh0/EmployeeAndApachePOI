package com.cts.ApachePOI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Scanner;

import org.apache.poi.hpsf.Date;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;

public class Apache {
	public static void main(String[] args) {
		Workbook workbook = new HSSFWorkbook();
		String s=WorkbookUtil.createSafeSheetName("sheet{}[]1");
		Sheet sheet=workbook.createSheet(s);
		Row row=sheet.createRow(0);

		row.createCell(0).setCellValue("Rank");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("Salary");
		row.createCell(3).setCellValue("Date");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to enter in excel sheel :");
		int n=sc.nextInt();
		System.out.println("Enter Rank, Name, Salary respectively :");
		
		OutputStream out=null;
		try {
			out = new FileOutputStream("ApachePOI.xls");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=1;i<=n;i++)
		{	Row r=sheet.createRow(i);
			int rank=sc.nextInt();
			String name=sc.next();
			Double salary=sc.nextDouble();
			r.createCell(0).setCellValue(rank);
			r.createCell(1).setCellValue(name);
			r.createCell(2).setCellValue(salary);
			r.createCell(3).setCellValue(new java.util.Date());
		}
		
		
		try {
			workbook.write(out);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
}

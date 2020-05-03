package com.wei.controller;

import java.io.File;
import java.util.UUID;

/**
 * @author wei.peng
 * @descripe SpringBootProject
 * @Date 2019/7/28 0028.
 */
public class Pdftest {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            String uuid= UUID.randomUUID().toString();
            System.out.println(uuid);
            System.out.println(uuid.length());
        }
      /*  try {
//            List<InputStream> pdfs = new ArrayList<InputStream>();
//            pdfs.add(new FileInputStream("e:\\123.pdf"));
//            pdfs.add(new FileInputStream("e:\\456.pdf"));
//            OutputStream output = new FileOutputStream("e:\\789.pdf");
//            concatPDFs(pdfs, output, true);

            ProcessPDF.addPdfImgMark("E:\\file2\\1502349579058.pdf",
                    "E:\\file2" + File.separator + "mark" + File.separator + "mark1111upGRAY.pdf",
                    "C:\\Users\\Administrator\\Desktop\\1127（图片水印）.png",
                    300, 350);
            ProcessPDF.addPdfTextMark("E:\\file2\\1502349579058.pdf",
                    "E:\\file2" + File.separator + "mark" + File.separator + "mark2222upGRAY.pdf", "要加的水印文字", 300, 350);
        } catch (Exception e) {
            e.printStackTrace();
        }*/


    }


}

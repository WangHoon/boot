package com.wx.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class QrCodeUtil {

	// 二维码颜色
	private static final int BLACK = 0xFF000000;
	// 二维码颜色
	private static final int WHITE = 0xFFFFFFFF;

	public void QRCodeCreate(String text, int width, int height) throws Exception {
		Map<EncodeHintType, String> his = new HashMap<EncodeHintType, String>();
		// 设置编码字符集
		his.put(EncodeHintType.CHARACTER_SET, "utf-8");
		// his.put(EncodeHintType.MARGIN, "2");
		// 1、生成二维码
		BitMatrix encode = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, his);

		// 2、获取二维码宽高
		int codeWidth = encode.getWidth();
		int codeHeight = encode.getHeight();

		// 3、将二维码放入缓冲流
		BufferedImage image = new BufferedImage(codeWidth, codeHeight, BufferedImage.TYPE_INT_RGB);
		for (int i = 0; i < codeWidth; i++) {
			for (int j = 0; j < codeHeight; j++) {
				// 4、循环将二维码内容定入图片
				image.setRGB(i, j, encode.get(i, j) ? BLACK : WHITE);
			}
		}

		File outPutImage = new File("D:\\aa.jpg");
		// 如果图片不存在创建图片
		if (!outPutImage.exists())
			outPutImage.createNewFile();
		// 5、将二维码写入图片
		ImageIO.write(image, "jpg", outPutImage);
	}

	public static void main(String[] args) {
		QrCodeUtil qr = new QrCodeUtil();
		try {
			qr.QRCodeCreate("http://192.168.88.133:8083/app/api/reg/39", 500, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

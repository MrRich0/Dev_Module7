package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class HttpStatusImageDownloader {
    void downloadStatusImage(int code) throws IOException {
        Image image = ImageIO.read(new URL(new HttpStatusChecker().getStatusImage(code)));
        ImageIO.write((RenderedImage) image, "jpg", new File(String.format("%d.jpg",code)));
        System.out.println("Image downloaded successfully.");
    }

//    public static void main(String[] args) throws IOException {
//        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
//        downloader.downloadStatusImage(4042);
//    }
}

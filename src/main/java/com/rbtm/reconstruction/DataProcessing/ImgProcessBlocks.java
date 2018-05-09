package com.rbtm.reconstruction.DataProcessing;

import org.opencv.core.Mat;

import java.util.List;

import  org.opencv.imgproc.Imgproc;


public class ImgProcessBlocks {
    public static List<Mat> threshold(List<Mat> block, double thresh) {
        block.stream().parallel().forEach(i -> {
            Imgproc.threshold(i, i, thresh, 255, Imgproc.THRESH_BINARY);
                }
        );
        return block;
    }
}
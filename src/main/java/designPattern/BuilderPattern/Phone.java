package designPattern.BuilderPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {

    int weight;
    String company;
    int RAM;
    int cameraPixels;
    int totalCameras;
    boolean isTouchScreen;
    boolean isKeypad;
    String color;

}

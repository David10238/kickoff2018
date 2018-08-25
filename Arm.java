package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Arm {
    private final Servo s1;
    private final Servo s2;

    public enum Position{
        LOADING(0.0, 1.0),
        LOW_GOAL(0.5, 0.5),
        HIGH_GOAL(1.0, 0.0);
        private final double s1Pos;
        private final double s2Pos;
        Position(double s1Pos, double s2Pos) {
            this.s1Pos = s1Pos;
            this.s2Pos = s2Pos;
        }
    }

    public Arm(HardwareMap hMap){
        s1 = hMap.servo.get("arm1");
        s2 = hMap.servo.get("arm2");
    }

    public void setPosition(Position position){
        s1.setPosition(position.s1Pos);
        s2.setPosition(position.s2Pos);
    }

}

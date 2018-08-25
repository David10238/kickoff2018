package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drive {
    private final DcMotor lf;
    private final DcMotor lb;
    private final DcMotor rf;
    private final DcMotor rb;

    public Drive(HardwareMap hMap){
        lf = hMap.dcMotor.get("lf");
        lb = hMap.dcMotor.get("lb");
        rf = hMap.dcMotor.get("rf");
        rb = hMap.dcMotor.get("rb");
    }

    private void powerLeft(double power){
        lf.setPower(power);
        lb.setPower(power);
    }

    private void powerRight(double power){
        rf.setPower(power);
        rb.setPower(power);
    }

    public void power(double left, double right){
        powerLeft(left);
        powerRight(right);
    }
}

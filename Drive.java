package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Drive {
    private final DcMotor lf;
    private final DcMotor lb;
    private final DcMotor rf;
    private final DcMotor rb;

    public Drive(LinearOpMode opMode){
        lf = hMap.dcMotor.get("lf");
        lb = hMap.dcMotor.get("lb");
        rf = hMap.dcMotor.get("rf");
        rb = hMap.dcMotor.get("rb");

        rf.setDirection(DcMotorSimple.Direction.REVERSE);
        rb.setDirection(DcMotorSimple.Direction.REVERSE);

        resetEncoders();
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

    public void resetEncoders(){
        setRunMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        opMode.idle();
        setRunMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    private void setRunMode(DcMotor.RunMode mode){
        lf.setMode(mode);
        lb.setMode(mode);
        rf.setMode(mode);
        rb.setMode(mode);
    }
}

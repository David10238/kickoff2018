package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private final DcMotor delegate;

    public enum State{
        IN(1.0),
        OUT(0.0),
        STOP(-1.0);
        private final double power;
        State(double power){
            this.power = power;
        }
    }

    public void setState(State state) {
        delegate.setPower(state.power);
    }

    public Intake(HardwareMap hMap){
        delegate = hMap.dcMotor.get("intake");
    }
}

package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class RobotClass {
    public final Drive drive;
    public final Intake intake;
    public final Arm arm;

    private final LinearOpMode opMode;
    public RobotClass(LinearOpMode opMode){
        this.opMode = opMode;
        drive = new Drive(opMode.hardwareMap);
        intake = new Intake(opMode.hardwareMap);
        arm = new Arm(opMode.hardwareMap);
    }
}

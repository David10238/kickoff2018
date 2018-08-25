package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class BasicAuto extends LinearOpMode{
    private RobotClass robot;
    @Override
    public void runOpMode() throws InterruptedException {
        robot = new RobotClass(this);

        waitForStart();

        // run forward to grab cube
        robot.intake.setState(Intake.State.IN);
        robot.drive.power(1.0, 1.0);
        sleep(5000);
        robot.drive.power(0.0, 0.0);
        robot.intake.setState(Intake.State.STOP);

        // dump cube
        robot.arm.setPosition(Arm.Position.HIGH_GOAL);
        sleep(2000);
        robot.intake.setState(Intake.State.OUT);
        sleep(1000);
        robot.arm.setPosition(Arm.Position.LOADING);

        // drive away from goal
        robot.drive.power(-1.0, -1.0);
        sleep(2000);
        robot.drive.power(0.0, 0.0);
    }
}

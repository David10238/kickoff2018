package org.firstinspires.ftc.teamcode.kickoff2018;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class TeleOp extends LinearOpMode{
    private RobotClass robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new RobotClass(this);

        waitForStart();

        while(opModeIsActive()){
            robot.drive.power(-gamepad1.left_stick_y, - gamepad1.right_stick_y);

            if(gamepad1.a)
                robot.intake.setState(Intake.State.IN);
            else if (gamepad1.b)
                robot.intake.setState(Intake.State.OUT);
            else if (gamepad1.x)
                robot.intake.setState(Intake.State.STOP);

            if (gamepad1.dpad_up)
                robot.arm.setPosition(Arm.Position.HIGH_GOAL);
            else if (gamepad1.dpad_right)
                robot.arm.setPosition(Arm.Position.LOW_GOAL);
            else if (gamepad1.dpad_down)
                robot.arm.setPosition(Arm.Position.LOADING);
        }
    }
}

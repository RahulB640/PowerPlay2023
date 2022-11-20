package org.firstinspires.ftc.teamcode.Autons;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Util.RobotHardwareMap;


@Autonomous(name="Red Diagonal Stripe Side Auton", group="Auton")
public class RedDiagonalStripeSide extends LinearOpMode {

    RobotHardwareMap robot = new RobotHardwareMap();

    @Override
    public void runOpMode() {
        robot.initialize(hardwareMap);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();


        if (opModeIsActive()){
            //To the left
            robot.frontLeftMotor.setPower(-0.5);
            robot.frontRightMotor.setPower(0.5);
            robot.backLeftMotor.setPower(0.5);
            robot.backRightMotor.setPower(-0.5);
            sleep(625);

            //stop
            robot.frontLeftMotor.setPower(0);
            robot.frontRightMotor.setPower(0);
            robot.backLeftMotor.setPower(0);
            robot.backRightMotor.setPower(0);
            sleep(500);

            //forward
            robot.frontLeftMotor.setPower(0.3);
            robot.frontRightMotor.setPower(0.3);
            robot.backLeftMotor.setPower(0.3);
            robot.backRightMotor.setPower(0.3);
            sleep(450);

            //stop
            robot.frontLeftMotor.setPower(0);
            robot.frontRightMotor.setPower(0);
            robot.backLeftMotor.setPower(0);
            robot.backRightMotor.setPower(0);
            sleep(500);

            //stop
            robot.frontLeftMotor.setPower(0);
            robot.frontRightMotor.setPower(0);
            robot.backLeftMotor.setPower(0);
            robot.backRightMotor.setPower(0);
            sleep(150);

            //backward
            robot.frontLeftMotor.setPower(-0.5);
            robot.frontRightMotor.setPower(-0.5);
            robot.backLeftMotor.setPower(-0.5);
            robot.backRightMotor.setPower(-0.5);
            sleep(400);

            //stop
            robot.frontLeftMotor.setPower(0);
            robot.frontRightMotor.setPower(0);
            robot.backLeftMotor.setPower(0);
            robot.backRightMotor.setPower(0);
            sleep(250);

            //right
            robot.frontLeftMotor.setPower(0.5);
            robot.frontRightMotor.setPower(-0.5);
            robot.backLeftMotor.setPower(-0.5);
            robot.backRightMotor.setPower(0.5);
            sleep(625);

            //stop
            robot.frontLeftMotor.setPower(0);
            robot.frontRightMotor.setPower(0);
            robot.backLeftMotor.setPower(0);
            robot.backRightMotor.setPower(0);
            sleep(150);

            //forward
            robot.frontLeftMotor.setPower(0.5);
            robot.frontRightMotor.setPower(0.5);
            robot.backLeftMotor.setPower(0.5);
            robot.backRightMotor.setPower(0.5);
            sleep(1300);


        }

    }
}
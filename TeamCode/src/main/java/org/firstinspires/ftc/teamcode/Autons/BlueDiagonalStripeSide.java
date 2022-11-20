package org.firstinspires.ftc.teamcode.Autons;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Util.RobotHardwareMap;


@Autonomous(name="Blue Diagonal Stripe Side Auton", group="Auton")
public class BlueDiagonalStripeSide extends LinearOpMode {

    RobotHardwareMap robot = new RobotHardwareMap();

    @Override
    public void runOpMode() {
        robot.initialize(hardwareMap);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();


        if (opModeIsActive()){
            //To the right
            robot.frontLeftMotor.setPower(0.5);
            robot.frontRightMotor.setPower(-0.5);
            robot.backLeftMotor.setPower(-0.5);
            robot.backRightMotor.setPower(0.5);
            sleep(725);

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
            sleep(550);

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
            sleep(150);

            //left
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
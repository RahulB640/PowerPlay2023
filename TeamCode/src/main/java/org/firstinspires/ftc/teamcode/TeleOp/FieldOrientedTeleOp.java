package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Movement.ActiveLocation;
import org.firstinspires.ftc.teamcode.Util.BasicAutoDriving;
import org.firstinspires.ftc.teamcode.Util.RobotHardwareMap;


@TeleOp(name = "Field Oriented TeleOp", group = "TeleOps")
public class FieldOrientedTeleOp extends LinearOpMode {

    RobotHardwareMap robot = new RobotHardwareMap();


    @Override
    public void runOpMode() {
        robot.initialize(hardwareMap);

        double drive;
        double strafe;
        double turn;

        double frontLeftPower;
        double frontRightPower;
        double backLeftPower;
        double backRightPower;

        ActiveLocation activeLocation = new ActiveLocation(robot);

        double currentAngle;

        double maxMotorSpeed = 0.6;

        double maxPower = 0.0;

        waitForStart();

        while (opModeIsActive()) {
            drive = -gamepad1.left_stick_y;
            strafe = gamepad1.left_stick_x;
            turn = gamepad1.right_stick_x;

            currentAngle = activeLocation.getAngleInRadians();

            drive = -gamepad1.left_stick_y * Math.cos(currentAngle) +
                    gamepad1.left_stick_x * Math.sin(currentAngle);
            strafe = gamepad1.left_stick_x * Math.cos(currentAngle) -
                    -gamepad1.left_stick_y * Math.sin(currentAngle);
            turn = gamepad1.right_stick_x;

            frontLeftPower = drive + strafe + turn;
            frontRightPower = drive - strafe - turn;
            backLeftPower = drive - strafe + turn;
            backRightPower = drive + strafe - turn;


            if (Math.abs(frontLeftPower) > 1 || Math.abs(frontRightPower) > 1 || Math.abs(backLeftPower) > 1 || Math.abs(backRightPower) > 1){

                maxPower = Math.max(Math.abs(frontLeftPower), Math.max(Math.abs(frontRightPower), Math.max(Math.abs(backLeftPower), Math.abs(backRightPower))));

                //fix problem
                frontLeftPower /= maxPower;
                frontRightPower /= maxPower;
                backLeftPower /= maxPower;
                backRightPower /= maxPower;
            }


            robot.frontLeftMotor.setPower(frontLeftPower * maxMotorSpeed);
            robot.frontRightMotor.setPower(frontRightPower * maxMotorSpeed);
            robot.backRightMotor.setPower(backRightPower * maxMotorSpeed);
            robot.backLeftMotor.setPower(backLeftPower * maxMotorSpeed);



            //TODO: Telemetry
            telemetry.addData("Front Left Motor Power: ", robot.frontLeftMotor.getPower());
            telemetry.addData("Front Right Motor Power: ", robot.frontRightMotor.getPower());
            telemetry.addData("Back Left Motor Power: ", robot.backLeftMotor.getPower());
            telemetry.addData("Back Right Motor Power: ", robot.backRightMotor.getPower());

            telemetry.update();
        }
    }
}














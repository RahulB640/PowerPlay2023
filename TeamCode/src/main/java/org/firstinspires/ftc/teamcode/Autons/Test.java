package org.firstinspires.ftc.teamcode.Autons;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.Util.BasicAutoDriving;
import org.firstinspires.ftc.teamcode.Util.RobotHardwareMap;


@TeleOp(name="Test", group="teleOp")
public class Test extends LinearOpMode {

    RobotHardwareMap robot = new RobotHardwareMap();

    @Override
    public void runOpMode() {
        robot.initialize(hardwareMap);

        robot.frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        robot.frontLeftMotor.setTargetPosition(0);
        robot.frontRightMotor.setTargetPosition(0);
        robot.backLeftMotor.setTargetPosition(0);
        robot.backRightMotor.setTargetPosition(0);

//        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
//        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        robot.frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();


        while (opModeIsActive()){
            telemetry.addData("fl ticks", robot.frontLeftMotor.getCurrentPosition());
            telemetry.addData("fr ticks", robot.frontRightMotor.getCurrentPosition());
            telemetry.addData("bl ticks", robot.backLeftMotor.getCurrentPosition());
            telemetry.addData("br ticks", robot.backRightMotor.getCurrentPosition());
            telemetry.update();




            //If it goes to far lower the value of ticksPerCentimeterDrive in the Basic Auto Driving file
            //If it doesn't go far enough than increase the value of ticksPerCentimeterDrive



            //should strafe to the left 90 cm
            //autoDriving.strafe(90);
            //sleep(2500);
            //If it goes to far lower the value of ticksPerCentimeterStrafe in the Basic Auto Driving file
            //If it doesn't go far enough than increase the value of ticksPerCentimeterStrafe


            //autoDriving.turn(360);
            //should turn 360 degrees clockwise
            //If it goes to far lower the value of ticksPerDegree in the Basic Auto Driving file
            //If it doesn't go far enough than increase the value of ticksPerDegree


        }

    }
}
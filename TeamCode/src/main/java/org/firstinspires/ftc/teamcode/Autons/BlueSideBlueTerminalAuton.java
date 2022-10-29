package org.firstinspires.ftc.teamcode.Autons;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Util.BasicAutoDriving;
import org.firstinspires.ftc.teamcode.Util.RobotHardwareMap;


@Autonomous(name="Blue Side Blue Terminal Auton", group="Auton")
public class BlueSideBlueTerminalAuton extends LinearOpMode {

    RobotHardwareMap robot = new RobotHardwareMap();
    BasicAutoDriving autoDriving = new BasicAutoDriving(robot.frontLeftMotor, robot.frontRightMotor, robot.backLeftMotor, robot.backRightMotor);

    @Override
    public void runOpMode() {
        robot.initialize(hardwareMap);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();


        if (opModeIsActive()){
            //WRITE PATHING HERE
            //autodriving.drive(amtOfCM)
            //autodriving.strafe(amtOfCM)
            //autodriving.turn(amtOfDegrees)
            //Stuff inside of Parenthesis is how much you want to move/turn
            //Use these function to make the robot follow the path decided in the google doc forever ago

        }

    }
}
package org.firstinspires.ftc.teamcode.Autons;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Util.BasicAutoDriving;
import org.firstinspires.ftc.teamcode.Util.RobotHardwareMap;


@Autonomous(name="UniversalAuton", group="Auton")
public class UniversalAuton extends LinearOpMode {

    RobotHardwareMap robot = new RobotHardwareMap();

    @Override
    public void runOpMode() {
        robot.initialize(hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();


        if (opModeIsActive()){

            //Should go forward 90 cm

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
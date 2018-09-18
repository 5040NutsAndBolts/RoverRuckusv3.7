package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Testing the intake system
 */
@TeleOp(name="intake", group="Pushbot")
public class Intake extends OpMode {

    private Hardware robot = null;

    /**
     *Constructor for setting up hardware class
     */
    public Intake() {
        robot = new Hardware();
    }

    /**
     *Runs once when you hit init
     */
    @Override
    public void init() {
        robot.init(hardwareMap, false);
    }

    /**
     * Runs after init() and loops after until you hit play
     */
    @Override
    public void init_loop() {
    }

    /**
     * Ran once after you hit play to start the program
     */
    @Override
    public void start() {

    }

    /**
     * Method that loops while it is running after you hit play
     * Most code will be in here
     */
    @Override
    public void loop() {
        //input
        boolean leftBumper = gamepad1.left_bumper, rightBumper = gamepad1.right_bumper;

        /*if(leftBumper) {
            robot.intake.setPower(1);
            //robot.intake.setPosition(1);
        }
        else if(rightBumper) {
            robot.intake.setPower(-1);
            //robot.intake.setPosition(0);
        }
        else{*/
        robot.intake.setPower(1);
        telemetry.addLine("testing");
            //robot.intake.setPosition(0.5);
        //}
    }
}
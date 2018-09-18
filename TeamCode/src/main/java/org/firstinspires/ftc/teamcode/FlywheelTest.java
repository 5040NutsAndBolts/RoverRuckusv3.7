package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Flywheel Test", group="Linear Opmode")
public class FlywheelTest extends LinearOpMode {
    Servo linActuator = null;
    DcMotor wheelSpinner = null;
    ColorSensor iBaller = null;

    private final double goldSpeed = 1;
    private final double silverSpeed = 0.5;

    // These next to values are temporary
    private final double YELLOW_VALUE = 1.0;
    private final double WHITE_VALUE = 1.0;

    public void runOpMode(){
        linActuator = hardwareMap.servo.get("armExtension");
        linActuator.setPosition(0);
        wheelSpinner = hardwareMap.dcMotor.get("flySpin");
        iBaller = hardwareMap.colorSensor.get("colorSensor");

        waitForStart();
        while(opModeIsActive()) {
            /*Flywheel:
                If color sensor shows
                  -white, actuator goes down and flywheels slow down
                  -yellow, actuator goes up and flywheels go quicker
            */
            wheelSpinner.setPower(0);
            if (iBaller.red() >= YELLOW_VALUE && iBaller.green() >= YELLOW_VALUE){
                wheelSpinner.setPower(goldSpeed);

            } else if (iBaller.red() >= WHITE_VALUE && iBaller.green() >= WHITE_VALUE && iBaller.blue() >= WHITE_VALUE){
                wheelSpinner.setPower(silverSpeed);
            }
        }
    }
}

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.I2cAddr;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.hardware.bosch.BNO055IMU;


/**
 *This class is for setting up all the hardware components of the robot.
 *This will have all the sensors, motors and servos declarations.
 *It will also be used to initialize everything for autonomous
 */
public class Hardware {

    public static final String MESSAGETAG = "5040MSG";

    HardwareMap hwMap;

    public DcMotor driveMotor;
    public Servo servo;

    /**
     * Constructor to set up the Hardwaremap
     */
    public Hardware() {

        hwMap = null;
    }

    /**
     *Method for initializing all the hardware components.
     *Use at the beginning of code initialization
     * @param ahwMap the hardware declaration being passed into this class
     * @param auto boolean to run initializations for auto
     */
    public void init(HardwareMap ahwMap, boolean auto) {
        // Save reference to Hardware map
        hwMap = ahwMap;
        driveMotor = hwMap.dcMotor.get("driveMotor");
        servo = hwMap.servo.get("servo");

    }
}

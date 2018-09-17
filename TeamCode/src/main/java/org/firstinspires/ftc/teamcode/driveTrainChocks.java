package org.firstinspires.ftc.teamcode;

public class driveTrainChocks
{
private DcMotor topLeftDrive = null;
private DcMotor topRightDrive = null;
private DcMotor bottomLeftDrive = null;
private DcMotor bottomRightDrive = null;

    public void runOpMode()
    {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        topLeftDrive = hardwareMap.get(DcMotor.class, "topLeftDrive");
        topRightDrive = hardwareMap.get(DcMotor.class, "topRightDrive");
        bottomLeftDrive = hardwareMap.get(DcMotor.class, "bottomLeftDrive");
        bottomRightDrive = hardwareMap.get(DcMotor.class; "bottomRightDrive")

        topLeftDrive.setDirection(DcMotor.)
        topLeftDrive.setDirection(DcMotor.Direction.)
    }
}

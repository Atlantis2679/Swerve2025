package frc.robot.subsystems.swerve.io;

import com.studica.frc.AHRS;

import team2679.atlantiskit.logfields.LogFieldsTable;

public class GyroIONavX extends GyroIO {
  private final AHRS navX = new AHRS(AHRS.NavXComType.kUSB1);

  public GyroIONavX(LogFieldsTable fieldsTable) {
    super(fieldsTable);
  }

  @Override
  protected double getYawDegreesCCW() {
    return -navX.getAngle();
  }

  @Override
  protected boolean getIsConnected() {
    return navX.isConnected();
  }

  @Override
  protected boolean getIsMoving(){
    return navX.isMoving();
  }
}
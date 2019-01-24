package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  private DifferentialDrive m_Robot;
  private Joystick m_leftStick;
  private Joystick m_rightStick;
  VictorSPX Front_left;
  VictorSPX rear_left;
  VictorSPX Front_right;
  VictorSPX rear_right;

  @Override
  public void robotInit() {
    m_Robot = new DifferentialDrive(Front_left,rear_left,Front_right,rear_right);
    m_leftStick = new Joystick(0);
    m_rightStick = new Joystick(1);
    Front_left = new VictorSPX(0);
    rear_left = new VictorSPX(1);
    Front_right = new VictorSPX(2);
    rear_right = new VictorSPX(3);
  }
  @Override
  public void teleopPeriodic() {
    m_Robot.tankDrive(m_leftStick.getY(), m_rightStick.getY());
  }
}

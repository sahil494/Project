package voting;

public class RegisterBean {
  String name;
  String email;
  String password;
  String mobile;
  String address;
  void setName(String name)
  {
      this.name=name;
  }
  void setEmail(String email)
  {
      this.email=email;
  }
  void setPassword(String password)
  {
      this.password = password;
  }
  void setMobile(String mobile)
  {
      this.mobile=mobile;
  }
  void setAddress(String address)
  {
      this.address=address;
  }
  String getName()
  {
      return this.name;
  }
  String getEmail()
  {
      return this.email;
  }
  String getPassword()
  {
      return this.password;
  }
  String getMobile()
  {
      return this.mobile;
  }
  String getAddress()
  {
      return this.address;
  }
}

type SleepLog = {
    id: Number;
    user: User;
    sleep_start: Date;
    wake_time: Date;
    quality_rating: Number;
    notes: String;
  };
  
  type User = {
    id: Number;
    email: String;
    password: String;
    username: String;
    firstname: String;
    lastname: String;
    phone: Number;
    role: Role;
  };
  
  enum Role {
    USER,
    ADMIN,
  }
  
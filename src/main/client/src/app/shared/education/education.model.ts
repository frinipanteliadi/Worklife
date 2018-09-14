import {User} from "../user/user.model";

export class Education {
  id: number;
  universityDegree: string;
  universityName: string;
  startDate: Date;
  endDate: Date;

  constructor(obj: User) {

    Object.keys(obj).forEach(key => {
      this[key] = obj[key];
    });
  }
}

export declare type Educations = Education[];

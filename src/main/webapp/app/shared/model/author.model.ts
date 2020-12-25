import { IBook } from 'app/shared/model/book.model';

export interface IAuthor {
  id?: number;
  name?: string;
  avoirs?: IBook[];
}

export class Author implements IAuthor {
  constructor(public id?: number, public name?: string, public avoirs?: IBook[]) {}
}

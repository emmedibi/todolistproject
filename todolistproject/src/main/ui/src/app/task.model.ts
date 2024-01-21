import { Category } from "./category.model";

export class Task {

    id!: number;
    title!: string;
    description!: string;
    start_date!: Date;
    end_date!: Date;
    is_repeated!: boolean;
    pace!: number;
    status!:string;
    category!: Category;
}

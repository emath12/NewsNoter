import {Article} from "./ArticleType.ts";

export default function ArticleCard({headline, short_description, pubDate, authors, category, link} : Article ) {

    return <div onClick={() => {
        console.log(link)
    }}>
        <p>{category}</p>
        <p className="text-xl">
            {headline}
        </p>
        <p>By : {authors}</p>
        <p className="italic">{pubDate.toString()}</p>
        <p>{short_description}</p>

        <p></p>
    </div>

}
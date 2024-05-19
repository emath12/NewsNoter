import {Article} from "./ArticleType.ts";
import ArticleCard from "./ArticleCard.tsx";


interface Props {
    queriedArticles : [Article]
}

export default function DisplayArticles({queriedArticles} : Props) {

    queriedArticles.map(({headline, short_description, pubDate, authors, category, link} : Article) => {
            return <ArticleCard
                headline={headline}
                short_description={short_description}
                link={link}
                category={category}
                authors={authors}
                pubDate={pubDate}
            />
        }
    )
}
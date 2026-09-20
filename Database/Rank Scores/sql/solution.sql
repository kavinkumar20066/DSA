select score , Dense_rank() over (Order by score desc) as 'rank' from scores
order by score DESC;

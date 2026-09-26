# Where Your Files Reside Determines Who Owns Your Life

**From China-US AI Dialogues to That ID Photo on Your Phone**

A detail you may have overlooked

On September 25, the heads of state of China and the United States reached an eight-point consensus. The seventh point is rarely mentioned yet may carry the farthest-reaching implications:

*“Both sides agree to establish a China-US artificial intelligence dialogue to exchange views on AI-related risks and benefits. The next dialogue will be held this November. Both sides agree to set up a communication channel for AI incidents.”*

When two major powers sit down to discuss AI safety, it sounds grand and distant. But dig one layer deeper: what feeds AI? Data. Whose data? Yours.

That same week, OpenAI confirmed it had detected coordinated cyberattacks launched by autonomous AI Agents. Also that week, the 5th Global Digital Trade Expo opened in Hangzhou, with governance and marketization of data elements as a core theme. Coordinated by the National Data Bureau, five cities were selected as pilot cities for data annotation trials.

Data is being treated and traded as a new type of production factor. That means your files, photos and documents are no longer merely “yours.” To others, they are raw material.

The question is not whether to use cloud storage. The real question is: whose cloud is your cloud?

## The Ordinary User’s Cloud Dilemma

I have a friend in foreign trade. All his client profiles, quotations and contract templates were stored on a mainstream cloud disk. Last year the platform updated its user agreement, adding a clause: “The platform reserves the right to conduct intelligent analysis on user-uploaded content to optimize service experience.”

He called customer service: “Will your AI read my contracts?”

The reply: “We only analyze data after anonymization and will not view original texts.”

Anonymization. Sounds safe. But how far does this anonymization go? Who defines what counts as sensitive? Contract amounts may be stripped out, names of contracting parties removed — but what about transaction categories, timing patterns and price ranges? Are those kept or erased? Even after anonymization, how much truth can a well-trained model reconstruct by piecing the data together?

He is no conspiracy theorist. He just ran a simple risk calculation: if competitors also use this same platform, what if the platform’s AI “happens” to learn insights from his data…

He later migrated all core files to an encrypted private cloud.

## The Cloud Storage Dilemma: Can Convenience and Privacy Coexist?

Most people do not need the heavy setup of a private cloud. Ordinary users have simple needs:

- Automatic photo backup on mobile phones, no loss when switching devices
- Multi-device sync for work documents, accessible from home PCs and office computers
- Secure storage for sensitive materials: ID photos, medical reports
- No intrusive ads pushing membership upgrades
- No secret scanning of files to feed AI training

Most cloud services on the market can deliver the first four points. The fifth is the true dividing line.

Dora Cloud made a clear technical choice on this front: user data is stored encrypted, and the platform holds no decryption keys.

What does this mean? It means even Dora Cloud engineers cannot open your files. Even if legal authorities demand Dora Cloud hand over a user’s data, only ciphertext will be surrendered. If servers are physically breached, attackers still get nothing but ciphertext.

Encryption is not a silver bullet. But it transforms the question of “will the platform read my files?” from a matter of trust to a matter of mathematics.

Trust can be broken. Mathematics cannot.

## Partitioned Storage for Regular Files vs Private Data

Another notable design detail of Dora Cloud: it separates storage into two zones, one for regular files and one for private data.

**Regular file zone** — photos, documents, music, videos — uses a high-speed sync channel for real-time multi-device synchronization and smooth user experience.

**Private data zone** — ID photos, bank card details, medical records, password vaults — runs on an encrypted storage channel. Secondary verification is required for every access, with more conservative sync policies (no automatic sync across all devices; manual selection is required).

Why separate them? Most people instinctively prioritize convenience over security. If everything were encrypted, sync would slow down and operations become cumbersome. Users would eventually turn encryption off. But if only the sensitive 5% of data is encrypted — acceptable minor friction, accessed only a few times a year — the remaining 95% stays fast and seamless.

Great security design does not force users to choose between safety and convenience. It puts each in its proper place.

## How Much Are Your Files Worth in the Era of Data Annotation?

At the Global Digital Trade Expo in Hangzhou, “data annotation” became a buzzword. Five cities were selected for pilot trials, and a coordination mechanism for embodied AI data annotation bases was officially launched.

What is data annotation? Simply put, humans teach AI to “read the world.” Annotators tag massive datasets — “this is a photo of a cat,” “this text carries negative sentiment,” “there is a nodule in this X-ray.” AI learns to understand the world from these labels.

This brings benefits. Yet it also means your unencrypted data may at any time become training material for others. Not necessarily because someone deliberately steals your files, but within the data economy supply chain: your documents may be collected, cleaned, annotated and fed into models without your knowledge.

Dora Cloud’s encryption breaks this chain at your end. Your private data can never be taken by anyone for annotation.

## Final thought

China and the US are negotiating AI governance. The whole world debates data sovereignty. Nations are building data element markets. These are big topics, seemingly far from ordinary people.

But one thing hits close to home: where is that ID photo you took today stored? Where is the PDF employment contract you downloaded last month? Where is the scanned copy of your child’s birth certificate?

Where these files sit determines who sees, uses and owns the details of your life.

Dora Cloud cannot reshape the macro landscape. But it gives you one thing: your files, truly in your own hands.

Is that enough? Perhaps not. But it is the starting point.

---

Dora Cloud. Partitioned storage for private data and regular files. End-to-end encryption. Platform holds no decryption keys. Your cloud belongs only to you.